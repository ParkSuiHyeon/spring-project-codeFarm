package com.codefarm.codefarmer.repository.mentor;

import com.codefarm.codefarmer.domain.board.QReplyDTO;
import com.codefarm.codefarmer.domain.mentor.QReviewDTO;
import com.codefarm.codefarmer.domain.mentor.ReviewDTO;
import com.codefarm.codefarmer.entity.mentor.QReview;
import com.codefarm.codefarmer.entity.mentor.Review;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.codefarm.codefarmer.entity.mentor.QReview.review;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ReviewCustomRepositoryImpl implements ReviewCustomRepository{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Review> findAll() {
        return jpaQueryFactory.selectFrom(review).fetch();
    }

    @Override
    public List<ReviewDTO> findAllList(Long mentorBoardId) {
        return jpaQueryFactory.select(new QReviewDTO(
                review.reviewId,
                review.member.memberId,
                review.mentorBoard.mentorBoardId,
                review.member.memberNickname,
                review.reviewContent,
                review.reviewStar,
                review.createdDate,
                review.updatedDate
                ))
                .from(review)
                .where(review.mentorBoard.mentorBoardId.eq(mentorBoardId))
                .orderBy(review.updatedDate.desc())
                .fetch();
    }
}
