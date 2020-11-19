package typingsSlinky.scriptExtHtmlWebpackPlugin.anon

import typingsSlinky.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks :'initial' | 'async' | 'all' | undefined} */
@js.native
trait ScriptMatchingPatternHash extends js.Object {
  
  var chunks: js.UndefOr[initial | async | all] = js.native
  
  var test: ScriptMatchingPatternBase = js.native
}
object ScriptMatchingPatternHash {
  
  @scala.inline
  def apply(test: ScriptMatchingPatternBase): ScriptMatchingPatternHash = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptMatchingPatternHash]
  }
  
  @scala.inline
  implicit class ScriptMatchingPatternHashOps[Self <: ScriptMatchingPatternHash] (val x: Self) extends AnyVal {
    
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
    def setTestVarargs(value: (String | js.RegExp)*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTestRegExp(value: js.RegExp): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: ScriptMatchingPatternBase): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunks(value: initial | async | all): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
  }
}
