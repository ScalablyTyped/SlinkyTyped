package typingsSlinky.stormDashReactDashDiagrams

import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsModelsDefaultLinkModelMod.DefaultLinkModel
import typingsSlinky.stormDashReactDashDiagrams.distSrcDefaultsWidgetsDefaultLinkWidgetMod.DefaultLinkWidget
import typingsSlinky.stormDashReactDashDiagrams.distSrcFactoriesAbstractLinkFactoryMod.AbstractLinkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", JSImport.Namespace)
@js.native
object distSrcDefaultsFactoriesDefaultLinkFactoryMod extends js.Object {
  @js.native
  class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): Element = js.native
  }
  
}

