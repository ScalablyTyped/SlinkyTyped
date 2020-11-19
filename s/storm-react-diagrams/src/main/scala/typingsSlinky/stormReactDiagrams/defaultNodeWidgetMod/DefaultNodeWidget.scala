package typingsSlinky.stormReactDiagrams.defaultNodeWidgetMod

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.baseWidgetMod.BaseWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultNodeWidget", "DefaultNodeWidget")
@js.native
class DefaultNodeWidget protected () extends BaseWidget[DefaultNodeProps, DefaultNodeState] {
  def this(props: DefaultNodeProps) = this()
  
  def generatePort(port: js.Any): ReactElement = js.native
}
