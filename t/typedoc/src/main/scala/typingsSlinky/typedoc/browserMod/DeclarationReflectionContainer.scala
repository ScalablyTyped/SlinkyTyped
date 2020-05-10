package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclarationReflectionContainer[T] extends js.Object {
  var extendedBy: js.UndefOr[js.Array[TypeObject]] = js.native
  var extendedTypes: js.UndefOr[js.Array[TypeObject]] = js.native
  var getSignature: js.UndefOr[js.Array[T]] = js.native
  var implementedBy: js.UndefOr[js.Array[TypeObject]] = js.native
  var implementedTypes: js.UndefOr[js.Array[TypeObject]] = js.native
  var indexSignature: js.UndefOr[js.Array[T]] = js.native
  var setSignature: js.UndefOr[js.Array[T]] = js.native
  var signatures: js.UndefOr[js.Array[T]] = js.native
}

object DeclarationReflectionContainer {
  @scala.inline
  def apply[T](): DeclarationReflectionContainer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeclarationReflectionContainer[T]]
  }
  @scala.inline
  implicit class DeclarationReflectionContainerOps[Self[t] <: DeclarationReflectionContainer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withExtendedBy(value: js.Array[TypeObject]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedTypes(value: js.Array[TypeObject]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedTypes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSignature(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetSignature: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementedBy(value: js.Array[TypeObject]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementedBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withImplementedTypes(value: js.Array[TypeObject]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementedTypes: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementedTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexSignature(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexSignature: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withSetSignature(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetSignature: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSignature")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatures(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatures: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatures")(js.undefined)
        ret
    }
  }
  
}

