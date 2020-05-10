package typingsSlinky.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDefaultLanguageValue[T] extends js.Object {
  var defaultLanguageValue: js.UndefOr[T] = js.native
  var defaultValue: js.UndefOr[T] = js.native
  var globalLanguageValue: js.UndefOr[T] = js.native
  var globalValue: js.UndefOr[T] = js.native
  var key: String = js.native
  var languageIds: js.UndefOr[js.Array[String]] = js.native
  var workspaceFolderLanguageValue: js.UndefOr[T] = js.native
  var workspaceFolderValue: js.UndefOr[T] = js.native
  var workspaceLanguageValue: js.UndefOr[T] = js.native
  var workspaceValue: js.UndefOr[T] = js.native
}

object AnonDefaultLanguageValue {
  @scala.inline
  def apply[T](key: String): AnonDefaultLanguageValue[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultLanguageValue[T]]
  }
  @scala.inline
  implicit class AnonDefaultLanguageValueOps[Self[t] <: AnonDefaultLanguageValue[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKey(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultLanguageValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLanguageValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLanguageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalLanguageValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalLanguageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalLanguageValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalLanguageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalValue")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageIds(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageIds: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceFolderLanguageValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolderLanguageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceFolderLanguageValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolderLanguageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceFolderValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolderValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceFolderValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceFolderValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceLanguageValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceLanguageValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceLanguageValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceLanguageValue")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceValue")(js.undefined)
        ret
    }
  }
  
}

