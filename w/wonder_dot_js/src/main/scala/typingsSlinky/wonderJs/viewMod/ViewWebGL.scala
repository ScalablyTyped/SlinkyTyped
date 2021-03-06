package typingsSlinky.wonderJs.viewMod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.wonderJs.anon.X
import typingsSlinky.wonderJs.anon.Y
import typingsSlinky.wonderJs.mainDataMod.ContextConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
@js.native
class ViewWebGL protected () extends IView {
  def this(dom: js.Any) = this()
  /* CompleteClass */
  override var dom: js.Any = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var offset: Y = js.native
  @JSName("offset")
  val offset_ViewWebGL: X = js.native
  /* CompleteClass */
  override var styleHeight: String = js.native
  /* CompleteClass */
  override var styleWidth: String = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def getContext(contextConfig: ContextConfigData): WebGLRenderingContext = js.native
  /* CompleteClass */
  override def initCanvas(): Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/structure/View", "ViewWebGL")
@js.native
object ViewWebGL extends js.Object {
  def create(view: js.Any): ViewWebGL = js.native
}

