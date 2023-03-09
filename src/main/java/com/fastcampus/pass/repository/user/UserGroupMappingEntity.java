package com.fastcampus.pass.repository.user;

import com.fastcampus.pass.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_group_mapping")
public class UserGroupMappingEntity extends BaseEntity {

    @Id
    private String userGroupId;
    @Id
    private String userId;
    private String userGroupName;
    private String description;
}
