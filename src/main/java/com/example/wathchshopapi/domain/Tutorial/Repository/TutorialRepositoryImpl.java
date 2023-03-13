package com.example.wathchshopapi.domain.Tutorial.Repository;

import com.example.wathchshopapi.domain.Tutorial.Model.Tutorial.Tutorial;
import com.example.wathchshopapi.global.base.BaseSearchRequest;
import com.example.wathchshopapi.global.utils.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TutorialRepositoryImpl implements TutorialRepository {

    private final JdbcTemplate baseJdbcTemplate;

    @Override
    public int save(Tutorial book) {
        return 0;
    }

    @Override
    public int update(Tutorial book) {
        return 0;
    }

    @Override
    public Tutorial findById(Long id) {
        return null;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Tutorial> search(BaseSearchRequest request) {
        String sp = StringUtils.formatSp("sp_student"
                , request.getPageBegin()
                , request.getPageEnd()
        );
        return baseJdbcTemplate.query(
                sp,
                BeanPropertyRowMapper.newInstance(Tutorial.class)
                , request.getPageBegin()
                , request.getPageEnd()
        );
    }

    @Override
    public List<Tutorial> findByPublished(boolean published) {
        return null;
    }

    @Override
    public List<Tutorial> findByTitleContaining(String title) {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
