package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractLinkFactoryMod.AbstractLinkFactory
import typingsSlinky.stormReactDiagrams.defaultLinkModelMod.DefaultLinkModel
import typingsSlinky.stormReactDiagrams.defaultLinkWidgetMod.DefaultLinkWidget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultLinkFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/factories/DefaultLinkFactory", "DefaultLinkFactory")
  @js.native
  class DefaultLinkFactory () extends AbstractLinkFactory[DefaultLinkModel] {
    
    def generateLinkSegment(model: DefaultLinkModel, widget: DefaultLinkWidget, selected: Boolean, path: String): ReactElement = js.native
  }
}
