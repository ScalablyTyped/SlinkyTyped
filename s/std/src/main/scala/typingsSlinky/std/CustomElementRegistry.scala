package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomElementRegistry extends StObject {
  
  def define(name: java.lang.String, constructor: CustomElementConstructor): Unit = js.native
  def define(name: java.lang.String, constructor: CustomElementConstructor, options: ElementDefinitionOptions): Unit = js.native
  
  def get(name: java.lang.String): js.Any = js.native
  
  def upgrade(root: org.scalajs.dom.raw.Node): Unit = js.native
  
  def whenDefined(name: java.lang.String): js.Promise[Unit] = js.native
}
