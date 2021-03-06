package id.dondon.ppmt.model.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

public class ProjectResponse implements Serializable {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("project_name")
  private String projectName;

  @JsonProperty("project_identifier")
  private String projectIdentifier;

  @JsonProperty("description")
  private String description;

  @JsonProperty("project_leader")
  private String projectLeader;

  @JsonProperty("start_date")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date startDate;

  @JsonProperty("end_date")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date endDate;

  @JsonProperty("created_at")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date createdAt;

  @JsonProperty("updated_at")
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date updatedAt;

  @JsonIgnore
  @JsonProperty("backlog")
  private BacklogResponse backlog;

  public ProjectResponse() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public BacklogResponse getBacklog() {
    return backlog;
  }

  public void setBacklog(BacklogResponse backlog) {
    this.backlog = backlog;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getProjectLeader() {
    return projectLeader;
  }

  public void setProjectLeader(String projectLeader) {
    this.projectLeader = projectLeader;
  }

  @Override
  public String toString() {
    return "ProjectResponse{" +
        "id=" + id +
        ", projectName='" + projectName + '\'' +
        ", projectIdentifier='" + projectIdentifier + '\'' +
        ", description='" + description + '\'' +
        ", projectLeader='" + projectLeader + '\'' +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", createdAt=" + createdAt +
        ", updatedAt=" + updatedAt +
        ", backlog=" + backlog +
        '}';
  }
}
