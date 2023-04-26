package com.ttrip.api.service;

import com.ttrip.api.dto.*;

import java.util.UUID;

public interface ArticleService {
    DataResDto<?> search(SearchReqDto searchReqDto);
    DataResDto<?> newArticle(NewArticleReqDto newArticleReqDto);
    DataResDto<?> searchDetail(Integer articleId, UUID memberUuid);
    DataResDto<?> ereaseArticle(Integer articleId, UUID memberUuid);
    DataResDto<?> newApply(ApplyReqDto applyReqDto);
    DataResDto<?> searchApply(Integer articleId, UUID memberUuid);
    DataResDto<?> endArticle(Integer articleId, UUID memberUuid);
}