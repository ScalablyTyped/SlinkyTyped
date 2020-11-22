package typingsSlinky.scrivito.components

import typingsSlinky.scrivito.mod.CurrentPage_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CurrentPage {
  
  @JSImport("scrivito", "CurrentPage")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): SharedBuilder_Object_159303587[CurrentPage_] = new SharedBuilder_Object_159303587[CurrentPage_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CurrentPage.type): SharedBuilder_Object_159303587[CurrentPage_] = new SharedBuilder_Object_159303587[CurrentPage_](js.Array(this.component, js.Dictionary.empty))()
}
