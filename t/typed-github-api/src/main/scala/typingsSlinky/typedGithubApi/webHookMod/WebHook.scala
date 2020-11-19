package typingsSlinky.typedGithubApi.webHookMod

import typingsSlinky.express.mod.Router
import typingsSlinky.typedGithubApi.githubRefMod.GitHubRef
import typingsSlinky.typedGithubApi.githubRefMod.OptionsOrRef
import typingsSlinky.typescriptEventHandler.funcMod.Action
import typingsSlinky.typescriptEventHandler.funcMod.AsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
