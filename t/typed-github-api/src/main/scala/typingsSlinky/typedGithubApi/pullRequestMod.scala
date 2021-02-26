package typingsSlinky.typedGithubApi

import typingsSlinky.typedGithubApi.branchMod.BranchSummary
import typingsSlinky.typedGithubApi.issueMod.IssueComment
import typingsSlinky.typedGithubApi.milestoneMod.Milestone
import typingsSlinky.typedGithubApi.teamMod.Team
import typingsSlinky.typedGithubApi.typedGithubApiStrings.APPROVED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.CHANGES_REQUESTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.COMMENTED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.DISMISSED
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.open
import typingsSlinky.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullRequestMod {
  
  @js.native
  trait PullRequest extends StObject {
    
    var assignee: UserSummary | Null = js.native
    
    var assignees: js.Array[UserSummary] = js.native
    
    var base: BranchSummary = js.native
    
    var body: String = js.native
    
    var closed_at: js.Date | Null = js.native
    
    var comments_url: String = js.native
    
    var commits_url: String = js.native
    
    var created_at: js.Date = js.native
    
    var head: BranchSummary = js.native
    
    var html_url: String = js.native
    
    var id: Double = js.native
    
    var issue_url: String = js.native
    
    var locked: Boolean = js.native
    
    var merged_at: js.Date | Null = js.native
    
    var milestone: Milestone | Null = js.native
    
    var number: Double = js.native
    
    var review_comment_url: String = js.native
    
    var review_comments_url: String = js.native
    
    var state: open | closed = js.native
    
    var statuses_url: String = js.native
    
    var title: String = js.native
    
    var updated_at: js.Date = js.native
    
    var url: String = js.native
    
    var user: UserSummary = js.native
  }
  object PullRequest {
    
    @scala.inline
    def apply(
      assignees: js.Array[UserSummary],
      base: BranchSummary,
      body: String,
      comments_url: String,
      commits_url: String,
      created_at: js.Date,
      head: BranchSummary,
      html_url: String,
      id: Double,
      issue_url: String,
      locked: Boolean,
      number: Double,
      review_comment_url: String,
      review_comments_url: String,
      state: open | closed,
      statuses_url: String,
      title: String,
      updated_at: js.Date,
      url: String,
      user: UserSummary
    ): PullRequest = {
      val __obj = js.Dynamic.literal(assignees = assignees.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commits_url = commits_url.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue_url = issue_url.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], review_comment_url = review_comment_url.asInstanceOf[js.Any], review_comments_url = review_comments_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], statuses_url = statuses_url.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[PullRequest]
    }
    
    @scala.inline
    implicit class PullRequestMutableBuilder[Self <: PullRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignee(value: UserSummary): Self = StObject.set(x, "assignee", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneeNull: Self = StObject.set(x, "assignee", null)
      
      @scala.inline
      def setAssignees(value: js.Array[UserSummary]): Self = StObject.set(x, "assignees", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssigneesVarargs(value: UserSummary*): Self = StObject.set(x, "assignees", js.Array(value :_*))
      
      @scala.inline
      def setBase(value: BranchSummary): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_at(value: js.Date): Self = StObject.set(x, "closed_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosed_atNull: Self = StObject.set(x, "closed_at", null)
      
      @scala.inline
      def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommits_url(value: String): Self = StObject.set(x, "commits_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_at(value: js.Date): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHead(value: BranchSummary): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssue_url(value: String): Self = StObject.set(x, "issue_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerged_at(value: js.Date): Self = StObject.set(x, "merged_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMerged_atNull: Self = StObject.set(x, "merged_at", null)
      
      @scala.inline
      def setMilestone(value: Milestone): Self = StObject.set(x, "milestone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilestoneNull: Self = StObject.set(x, "milestone", null)
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReview_comment_url(value: String): Self = StObject.set(x, "review_comment_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReview_comments_url(value: String): Self = StObject.set(x, "review_comments_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatuses_url(value: String): Self = StObject.set(x, "statuses_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdated_at(value: js.Date): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Review extends StObject {
    
    var body: String = js.native
    
    var commit_id: String = js.native
    
    var html_url: String = js.native
    
    var id: Double = js.native
    
    var pull_request_url: String = js.native
    
    var state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED = js.native
    
    var user: UserSummary = js.native
  }
  object Review {
    
    @scala.inline
    def apply(
      body: String,
      commit_id: String,
      html_url: String,
      id: Double,
      pull_request_url: String,
      state: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED,
      user: UserSummary
    ): Review = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[Review]
    }
    
    @scala.inline
    implicit class ReviewMutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: APPROVED | CHANGES_REQUESTED | COMMENTED | DISMISSED): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: UserSummary): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReviewComment extends IssueComment {
    
    var commit_id: String = js.native
    
    var diff_hunk: String = js.native
    
    var original_commit_id: String = js.native
    
    var original_position: Double = js.native
    
    var path: String = js.native
    
    var position: Double = js.native
    
    var pull_request_review_id: Double = js.native
    
    var pull_request_url: String = js.native
  }
  object ReviewComment {
    
    @scala.inline
    def apply(
      body: String,
      commit_id: String,
      created_at: js.Date,
      diff_hunk: String,
      html_url: String,
      id: Double,
      original_commit_id: String,
      original_position: Double,
      path: String,
      position: Double,
      pull_request_review_id: Double,
      pull_request_url: String,
      updated_at: js.Date,
      url: String,
      user: UserSummary
    ): ReviewComment = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], commit_id = commit_id.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], diff_hunk = diff_hunk.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], original_commit_id = original_commit_id.asInstanceOf[js.Any], original_position = original_position.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], pull_request_review_id = pull_request_review_id.asInstanceOf[js.Any], pull_request_url = pull_request_url.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewComment]
    }
    
    @scala.inline
    implicit class ReviewCommentMutableBuilder[Self <: ReviewComment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommit_id(value: String): Self = StObject.set(x, "commit_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiff_hunk(value: String): Self = StObject.set(x, "diff_hunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_commit_id(value: String): Self = StObject.set(x, "original_commit_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginal_position(value: Double): Self = StObject.set(x, "original_position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull_request_review_id(value: Double): Self = StObject.set(x, "pull_request_review_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPull_request_url(value: String): Self = StObject.set(x, "pull_request_url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReviewRequests extends StObject {
    
    var teams: js.Array[Team] = js.native
    
    var users: js.Array[UserSummary] = js.native
  }
  object ReviewRequests {
    
    @scala.inline
    def apply(teams: js.Array[Team], users: js.Array[UserSummary]): ReviewRequests = {
      val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReviewRequests]
    }
    
    @scala.inline
    implicit class ReviewRequestsMutableBuilder[Self <: ReviewRequests] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTeams(value: js.Array[Team]): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamsVarargs(value: Team*): Self = StObject.set(x, "teams", js.Array(value :_*))
      
      @scala.inline
      def setUsers(value: js.Array[UserSummary]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersVarargs(value: UserSummary*): Self = StObject.set(x, "users", js.Array(value :_*))
    }
  }
}
