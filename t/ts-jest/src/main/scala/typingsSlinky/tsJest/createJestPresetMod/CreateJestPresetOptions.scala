package typingsSlinky.tsJest.createJestPresetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJestPresetOptions extends js.Object {
  
  var allowJs: js.UndefOr[Boolean] = js.native
}
object CreateJestPresetOptions {
  
  @scala.inline
  def apply(): CreateJestPresetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJestPresetOptions]
  }
  
  @scala.inline
  implicit class CreateJestPresetOptionsOps[Self <: CreateJestPresetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowJs(value: Boolean): Self = this.set("allowJs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowJs: Self = this.set("allowJs", js.undefined)
  }
}
