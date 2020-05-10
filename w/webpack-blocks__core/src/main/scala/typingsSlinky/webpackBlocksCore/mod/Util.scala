package typingsSlinky.webpackBlocksCore.mod

import typingsSlinky.webpack.mod.Configuration
import typingsSlinky.webpack.mod.Plugin
import typingsSlinky.webpack.mod.RuleSetRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Util extends js.Object {
  def addLoader(loaderDefinition: RuleSetRule): js.Function0[Configuration] = js.native
  def addPlugin(plugin: Plugin): js.Function0[Configuration] = js.native
  def merge(configSnippet: Configuration): js.Function0[Configuration] = js.native
}

object Util {
  @scala.inline
  def apply(
    addLoader: RuleSetRule => js.Function0[Configuration],
    addPlugin: Plugin => js.Function0[Configuration],
    merge: Configuration => js.Function0[Configuration]
  ): Util = {
    val __obj = js.Dynamic.literal(addLoader = js.Any.fromFunction1(addLoader), addPlugin = js.Any.fromFunction1(addPlugin), merge = js.Any.fromFunction1(merge))
    __obj.asInstanceOf[Util]
  }
  @scala.inline
  implicit class UtilOps[Self <: Util] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLoader(value: RuleSetRule => js.Function0[Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLoader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddPlugin(value: Plugin => js.Function0[Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPlugin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMerge(value: Configuration => js.Function0[Configuration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

