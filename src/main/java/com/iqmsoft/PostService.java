package com.iqmsoft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.Mappers.PostMapper;



@Service
public class PostService {

    @Autowired
    PostMapper postMapper;

    public String getTextById(int id)
    {
        return postMapper.findTextById(id);
    }
}
