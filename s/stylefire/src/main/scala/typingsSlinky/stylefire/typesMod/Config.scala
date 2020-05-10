package typingsSlinky.stylefire.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var aliasMap: js.UndefOr[StringDictionary[String]] = js.native
  var uncachedValues: js.UndefOr[Set[String]] = js.native
  var useCache: js.UndefOr[Boolean] = js.native
  def onRead(key: String, props: Props): js.Any = js.native
  def onRender(state: State, props: Props, changedValues: ChangedValues): Unit = js.native
}

object Config {
  @scala.inline
  def apply(onRead: (String, Props) => js.Any, onRender: (State, Props, ChangedValues) => Unit): Config = {
    val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnRead(value: (String, Props) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRead")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnRender(value: (State, Props, ChangedValues) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRender")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAliasMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliasMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliasMap")(js.undefined)
        ret
    }
    @scala.inline
    def withUncachedValues(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncachedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUncachedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncachedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCache")(js.undefined)
        ret
    }
  }
  
}

