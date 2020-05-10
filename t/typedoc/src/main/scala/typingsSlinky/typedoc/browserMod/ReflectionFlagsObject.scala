package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReflectionFlagsObject extends js.Object {
  var hasExportAssignment: js.UndefOr[Boolean] = js.native
  var isConstructorProperty: js.UndefOr[Boolean] = js.native
  var isExported: js.UndefOr[Boolean] = js.native
  var isExternal: js.UndefOr[Boolean] = js.native
  var isOptional: js.UndefOr[Boolean] = js.native
  var isPrivate: js.UndefOr[Boolean] = js.native
  var isProtected: js.UndefOr[Boolean] = js.native
  var isPublic: js.UndefOr[Boolean] = js.native
  var isRest: js.UndefOr[Boolean] = js.native
  var isStatic: js.UndefOr[Boolean] = js.native
}

object ReflectionFlagsObject {
  @scala.inline
  def apply(): ReflectionFlagsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReflectionFlagsObject]
  }
  @scala.inline
  implicit class ReflectionFlagsObjectOps[Self <: ReflectionFlagsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasExportAssignment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExportAssignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasExportAssignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasExportAssignment")(js.undefined)
        ret
    }
    @scala.inline
    def withIsConstructorProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructorProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsConstructorProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConstructorProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExported")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExternal")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOptional(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOptional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOptional")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrivate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsProtected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProtected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProtected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProtected")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPublic")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRest")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStatic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStatic")(js.undefined)
        ret
    }
  }
  
}

