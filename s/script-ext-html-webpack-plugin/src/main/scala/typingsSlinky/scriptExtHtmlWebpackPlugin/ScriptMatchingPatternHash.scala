package typingsSlinky.scriptExtHtmlWebpackPlugin

import typingsSlinky.scriptExtHtmlWebpackPlugin.mod.ScriptMatchingPatternBase
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.all
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.async
import typingsSlinky.scriptExtHtmlWebpackPlugin.scriptExtHtmlWebpackPluginStrings.initial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined script-ext-html-webpack-plugin.script-ext-html-webpack-plugin.ScriptMatchingPatternHash & {  chunks ? :'initial' | 'async' | 'all'} */
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
    def withTestRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: ScriptMatchingPatternBase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChunks(value: initial | async | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunks")(js.undefined)
        ret
    }
  }
  
}

