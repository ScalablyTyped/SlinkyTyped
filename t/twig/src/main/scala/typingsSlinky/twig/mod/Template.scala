package typingsSlinky.twig.mod

import typingsSlinky.twig.twigBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Template extends js.Object {
  
  def compile(options: js.Any): String = js.native
  
  def getLoaderMethod(): String = js.native
  
  def importBlocks(file: String): Unit = js.native
  def importBlocks(file: String, `override`: Boolean): Unit = js.native
  
  def importFile(file: String): Template = js.native
  
  def importMacros(file: String): Template = js.native
  
  def render(): String = js.native
  def render(context: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: js.UndefOr[scala.Nothing], params: js.Any): String = js.native
  def render(context: js.UndefOr[scala.Nothing], params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: js.Any): String = js.native
  def render(context: js.Any, params: js.UndefOr[scala.Nothing], allow_async: Boolean): String | js.Promise[String] = js.native
  def render(context: js.Any, params: js.Any): String = js.native
  def render(context: js.Any, params: js.Any, allow_async: Boolean): String | js.Promise[String] = js.native
  
  def renderAsync(): js.Promise[String] = js.native
  def renderAsync(context: js.UndefOr[scala.Nothing], params: js.Any): js.Promise[String] = js.native
  def renderAsync(context: js.Any): js.Promise[String] = js.native
  def renderAsync(context: js.Any, params: js.Any): js.Promise[String] = js.native
  
  @JSName("render")
  def render_Union(): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: js.UndefOr[scala.Nothing], params: js.Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: js.Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_Union(context: js.Any, params: js.Any): String | js.Promise[String] = js.native
  @JSName("render")
  def render_false(context: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: js.UndefOr[scala.Nothing], params: js.Any, allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: js.Any, params: js.UndefOr[scala.Nothing], allow_async: `false`): String = js.native
  @JSName("render")
  def render_false(context: js.Any, params: js.Any, allow_async: `false`): String = js.native
  
  def reset(blocks: js.Any): Unit = js.native
}
