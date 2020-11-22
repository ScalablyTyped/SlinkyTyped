package typingsSlinky.tsJest.createJestPresetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jestTypes.configMod.Glob
import typingsSlinky.jestTypes.configMod.Path
import typingsSlinky.jestTypes.configMod.TransformerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@jest/types.@jest/types.Config.InitialOptions, 'moduleFileExtensions' | 'transform' | 'testMatch'> */
@js.native
trait TsJestPresets extends js.Object {
  
  var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.native
  
  var testMatch: js.UndefOr[js.Array[Glob]] = js.native
  
  var transform: js.UndefOr[StringDictionary[Path | TransformerConfig]] = js.native
}
object TsJestPresets {
  
  @scala.inline
  def apply(): TsJestPresets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsJestPresets]
  }
  
  @scala.inline
  implicit class TsJestPresetsOps[Self <: TsJestPresets] (val x: Self) extends AnyVal {
    
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
    def setModuleFileExtensionsVarargs(value: String*): Self = this.set("moduleFileExtensions", js.Array(value :_*))
    
    @scala.inline
    def setModuleFileExtensions(value: js.Array[String]): Self = this.set("moduleFileExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleFileExtensions: Self = this.set("moduleFileExtensions", js.undefined)
    
    @scala.inline
    def setTestMatchVarargs(value: Glob*): Self = this.set("testMatch", js.Array(value :_*))
    
    @scala.inline
    def setTestMatch(value: js.Array[Glob]): Self = this.set("testMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMatch: Self = this.set("testMatch", js.undefined)
    
    @scala.inline
    def setTransform(value: StringDictionary[Path | TransformerConfig]): Self = this.set("transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
