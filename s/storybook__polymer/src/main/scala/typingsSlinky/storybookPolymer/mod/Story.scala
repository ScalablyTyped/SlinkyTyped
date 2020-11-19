package typingsSlinky.storybookPolymer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Story extends js.Object {
  
  def add(storyName: String, callback: RenderFunction): this.type = js.native
  def add(storyName: String, callback: RenderFunction, parameters: DecoratorParameters): this.type = js.native
  
  def addDecorator(decorator: StoryDecorator): this.type = js.native
  
  def addParameters(parameters: DecoratorParameters): this.type = js.native
  
  val kind: String = js.native
}
