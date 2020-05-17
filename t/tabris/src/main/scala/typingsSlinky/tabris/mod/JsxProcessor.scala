package typingsSlinky.tabris.mod

import typingsSlinky.tabris.JSX.ElementClass
import typingsSlinky.tabris.anon.Instantiable
import typingsSlinky.tabris.anon.InstantiableNativeObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "JsxProcessor")
@js.native
class JsxProcessor () extends js.Object {
  val jsxFactory: js.Symbol = js.native
  val jsxType: js.Symbol = js.native
  def createCustomComponent(`type`: Instantiable, attributes: js.Object): ElementClass | String = js.native
  def createElement(`type`: String, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  def createElement(`type`: Instantiable, attributes: js.Object, children: ElementClass*): ElementClass | String = js.native
  def createFunctionalComponent(`type`: js.Function1[/* param */ js.Object, _], attributes: js.Object): ElementClass | String = js.native
  def createIntrinsicElement(`type`: String, attributes: js.Object): ElementClass | String = js.native
  def createNativeObject(Type: InstantiableNativeObject, attributes: js.Object): NativeObject = js.native
}

