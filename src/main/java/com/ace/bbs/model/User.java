package com.ace.bbs.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ace on 2017/6/25.
 */
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;

    private String name;
    private String loginName;
    private String password;
    private String email;
    private String url;
    private String profileImageUrl;
    private String location;
    private String signature;
    private String profile;
    private String weibo;
    private String avatar;
    private String githubUsername;
    private String githubAccessToken;
    private Boolean isBlock = false;

    private Long score = 0L;
    private Long topicCount = 0L;
    private Long replyCount = 0L;
    private Long followerCount = 0L;
    private Long followingCount = 0L;
    private Long collectTagCount = 0L;
    private Long collectTopicCount = 0L;

    private Date createAt;
    private Date updateAt;
    private Boolean isStar;
    private String level;
    private Boolean active = false;

    private Boolean receiveReplyMail = false;
    private Boolean receiveAtMail = false;
    private Boolean fromWp;
    private Long retrieveTimes;
    private String retrieveKey;

    private String accessToken;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGithubUsername() {
        return githubUsername;
    }

    public void setGithubUsername(String githubUsername) {
        this.githubUsername = githubUsername;
    }

    public String getGithubAccessToken() {
        return githubAccessToken;
    }

    public void setGithubAccessToken(String githubAccessToken) {
        this.githubAccessToken = githubAccessToken;
    }

    public Boolean getBlock() {
        return isBlock;
    }

    public void setBlock(Boolean block) {
        isBlock = block;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getTopicCount() {
        return topicCount;
    }

    public void setTopicCount(Long topicCount) {
        this.topicCount = topicCount;
    }

    public Long getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Long replyCount) {
        this.replyCount = replyCount;
    }

    public Long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }

    public Long getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Long followingCount) {
        this.followingCount = followingCount;
    }

    public Long getCollectTagCount() {
        return collectTagCount;
    }

    public void setCollectTagCount(Long collectTagCount) {
        this.collectTagCount = collectTagCount;
    }

    public Long getCollectTopicCount() {
        return collectTopicCount;
    }

    public void setCollectTopicCount(Long collectTopicCount) {
        this.collectTopicCount = collectTopicCount;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getStar() {
        return isStar;
    }

    public void setStar(Boolean star) {
        isStar = star;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getReceiveReplyMail() {
        return receiveReplyMail;
    }

    public void setReceiveReplyMail(Boolean receiveReplyMail) {
        this.receiveReplyMail = receiveReplyMail;
    }

    public Boolean getReceiveAtMail() {
        return receiveAtMail;
    }

    public void setReceiveAtMail(Boolean receiveAtMail) {
        this.receiveAtMail = receiveAtMail;
    }

    public Boolean getFromWp() {
        return fromWp;
    }

    public void setFromWp(Boolean fromWp) {
        this.fromWp = fromWp;
    }

    public Long getRetrieveTimes() {
        return retrieveTimes;
    }

    public void setRetrieveTimes(Long retrieveTimes) {
        this.retrieveTimes = retrieveTimes;
    }

    public String getRetrieveKey() {
        return retrieveKey;
    }

    public void setRetrieveKey(String retrieveKey) {
        this.retrieveKey = retrieveKey;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
