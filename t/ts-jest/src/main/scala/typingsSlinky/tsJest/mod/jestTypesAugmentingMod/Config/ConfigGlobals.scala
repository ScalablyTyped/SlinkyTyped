package typingsSlinky.tsJest.mod.jestTypesAugmentingMod.Config

import typingsSlinky.tsJest.typesMod.TsJestGlobalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigGlobals extends js.Object {
  
  var `ts-jest`: TsJestGlobalOptions = js.native
}
object ConfigGlobals {
  
  @scala.inline
  def apply(`ts-jest`: TsJestGlobalOptions): ConfigGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ts-jest")(`ts-jest`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigGlobals]
  }
  
  @scala.inline
  implicit class ConfigGlobalsOps[Self <: ConfigGlobals] (val x: Self) extends AnyVal {
    
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
    def `setTs-jest`(value: TsJestGlobalOptions): Self = this.set("ts-jest", value.asInstanceOf[js.Any])
  }
}
