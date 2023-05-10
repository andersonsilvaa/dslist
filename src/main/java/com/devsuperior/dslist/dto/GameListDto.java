package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Setter
@Getter
@NoArgsConstructor
public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(GameList entity) {
        BeanUtils.copyProperties(entity, this);
    }

}

