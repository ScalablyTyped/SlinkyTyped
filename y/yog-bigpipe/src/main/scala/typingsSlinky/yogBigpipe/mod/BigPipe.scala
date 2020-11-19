package typingsSlinky.yogBigpipe.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.yogBigpipe.anon.Dictkey
import typingsSlinky.yogBigpipe.mod.Pagelet.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yog-bigpipe", "BigPipe")
@js.native
class BigPipe () extends Readable {
  def this(option: BigPipeOption) = this()
  
  var Pagelet: PageletConstructor[typingsSlinky.yogBigpipe.mod.Pagelet] = js.native
  
  def _checkFinish(): Unit = js.native
  
  def _markPageletRendered(pagelet: Pagelet): Unit = js.native
  
  def _onPageletDone(pagelet: Pagelet): Unit = js.native
  
  def addPagelet(obj: AddPageletConfig): Unit = js.native
  
  def addQuicklingPagelets(pagelets: js.Array[String]): Unit = js.native
  
  def bind(id: String, fn: Callback): BigPipe = js.native
  
  def bindPageOnly(fn: Callback): Unit = js.native
  
  def format(pagelet: Pagelet): String = js.native
  
  def isQuickingMode(): Boolean = js.native
  
  def isQuicklingMode(): Boolean = js.native
  
  def isQuicklingWidget(item: Dictkey): Unit = js.native
  
  var map: StringDictionary[Pagelet] = js.native
  
  def outputPagelet(pagelet: Pagelet): Unit = js.native
  
  var pagelets: js.Array[Pagelet] = js.native
  
  var parentQuicklings: js.Array[String] = js.native
  
  var pipelines: js.Array[Pagelet] = js.native
  
  def prepareAllSources(): js.Promise[_] = js.native
  
  def preparePageOnly(): js.Promise[_] = js.native
  
  def render(): Unit = js.native
  
  def renderPagelet(pagelet: Pagelet): Unit = js.native
  
  var rendered: js.Array[Pagelet] = js.native
  
  var state: status = js.native
}
