package typingsSlinky.typedGithubApi

import typingsSlinky.express.mod.Router
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typedGithubApi.interfacesIssueMod.Issue
import typingsSlinky.typedGithubApi.interfacesUserMod.UserSummary
import typingsSlinky.typedGithubApi.typedGithubApiStrings.assigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.closed
import typingsSlinky.typedGithubApi.typedGithubApiStrings.demilestoned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.edited
import typingsSlinky.typedGithubApi.typedGithubApiStrings.labeled
import typingsSlinky.typedGithubApi.typedGithubApiStrings.milestoned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.opened
import typingsSlinky.typedGithubApi.typedGithubApiStrings.reopened
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unassigned
import typingsSlinky.typedGithubApi.typedGithubApiStrings.unlabeled
import typingsSlinky.typescriptEventHandler.funcMod.Action
import typingsSlinky.typescriptEventHandler.funcMod.AsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webHookMod {
  
  @JSImport("typed-github-api/dist/web-hook", "IssueWebHook")
  @js.native
  class IssueWebHook protected ()
    extends WebHook[IssueWebHookData, typingsSlinky.typedGithubApi.webHooksMod.IssueWebHookData] {
    def this(options: OptionsOrRef) = this()
    def this(secret: js.UndefOr[scala.Nothing], options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
  }
  
  @JSImport("typed-github-api/dist/web-hook", "WebHook")
  @js.native
  abstract class WebHook[TData /* <: WebHookData */, TApiData /* <: typingsSlinky.typedGithubApi.webHooksMod.WebHookData */] protected () extends GitHubRef {
    def this(options: OptionsOrRef) = this()
    def this(secret: js.UndefOr[scala.Nothing], options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
    
    /* protected */ def convertData(request: WebHookData, data: TApiData): TData = js.native
    
    val handlers: js.Any = js.native
    
    def registerAsyncHandler(handler: AsyncAction[TData]): Unit = js.native
    
    def registerHandler(handler: Action[TData]): Unit = js.native
    
    /* private */ def requestHandler(req: js.Any, res: js.Any): js.Any = js.native
    
    val router: Router = js.native
    
    var secret: js.Any = js.native
  }
  
  @js.native
  trait IssueWebHookData extends WebHookData {
    
    @JSName("action")
    var action_IssueWebHookData: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened = js.native
    
    var issue: Issue = js.native
  }
  object IssueWebHookData {
    
    @scala.inline
    def apply(
      action: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened,
      event: String,
      id: String,
      issue: Issue,
      sender: UserSummary
    ): IssueWebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[IssueWebHookData]
    }
    
    @scala.inline
    implicit class IssueWebHookDataMutableBuilder[Self <: IssueWebHookData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: assigned | unassigned | labeled | unlabeled | opened | edited | milestoned | demilestoned | closed | reopened
      ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssue(value: Issue): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebHookData extends StObject {
    
    var action: String = js.native
    
    var event: String = js.native
    
    var id: String = js.native
    
    var sender: UserSummary = js.native
  }
  object WebHookData {
    
    @scala.inline
    def apply(action: String, event: String, id: String, sender: UserSummary): WebHookData = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebHookData]
    }
    
    @scala.inline
    implicit class WebHookDataMutableBuilder[Self <: WebHookData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: UserSummary): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
}
