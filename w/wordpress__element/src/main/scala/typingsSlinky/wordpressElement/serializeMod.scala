package typingsSlinky.wordpressElement

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/element/build-types/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  
  def default(element: ReactElement): String = js.native
  def default(element: ReactElement, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  def default(element: ReactElement, context: js.Any): String = js.native
  def default(element: ReactElement, context: js.Any, legacyContext: js.Any): String = js.native
  
  def hasPrefix(string: String, prefixes: js.Array[String]): Boolean = js.native
  
  def renderAttributes(props: js.Any): String = js.native
  
  def renderComponent(Component: ReactComponentClass[js.Object], props: js.Any): String = js.native
  def renderComponent(
    Component: ReactComponentClass[js.Object],
    props: js.Any,
    context: js.UndefOr[scala.Nothing],
    legacyContext: js.Any
  ): String = js.native
  def renderComponent(Component: ReactComponentClass[js.Object], props: js.Any, context: js.Any): String = js.native
  def renderComponent(Component: ReactComponentClass[js.Object], props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  
  def renderElement(element: ReactElement): String = js.native
  def renderElement(element: ReactElement, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  def renderElement(element: ReactElement, context: js.Any): String = js.native
  def renderElement(element: ReactElement, context: js.Any, legacyContext: js.Any): String = js.native
  
  def renderNativeComponent(`type`: String, props: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.UndefOr[scala.Nothing], legacyContext: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any): String = js.native
  def renderNativeComponent(`type`: String, props: js.Any, context: js.Any, legacyContext: js.Any): String = js.native
  
  def renderStyle(style: js.Any): String = js.native
  
  type WPComponent = ReactComponentClass[js.Object]
  
  type WPElement = ReactElement
}
