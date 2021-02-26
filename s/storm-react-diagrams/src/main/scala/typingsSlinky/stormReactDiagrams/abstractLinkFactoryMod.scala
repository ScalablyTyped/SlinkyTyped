package typingsSlinky.stormReactDiagrams

import slinky.core.facade.ReactElement
import typingsSlinky.stormReactDiagrams.abstractFactoryMod.AbstractFactory
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModel
import typingsSlinky.stormReactDiagrams.linkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractLinkFactoryMod {
  
  @JSImport("storm-react-diagrams/dist/src/factories/AbstractLinkFactory", "AbstractLinkFactory")
  @js.native
  abstract class AbstractLinkFactory[T /* <: LinkModel[LinkModelListener] */] protected () extends AbstractFactory[T] {
    def this(name: String) = this()
    
    def generateReactWidget(diagramEngine: DiagramEngine, link: T): ReactElement = js.native
  }
}
