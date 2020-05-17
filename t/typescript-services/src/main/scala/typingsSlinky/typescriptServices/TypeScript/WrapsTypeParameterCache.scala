package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapsTypeParameterCache extends js.Object {
  var _wrapsTypeParameterCache: js.Any = js.native
  def getWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Double = js.native
  def setWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap, wrappingTypeParameterID: Double): Unit = js.native
}

object WrapsTypeParameterCache {
  @scala.inline
  def apply(
    _wrapsTypeParameterCache: js.Any,
    getWrapsTypeParameter: TypeArgumentMap => Double,
    setWrapsTypeParameter: (TypeArgumentMap, Double) => Unit
  ): WrapsTypeParameterCache = {
    val __obj = js.Dynamic.literal(_wrapsTypeParameterCache = _wrapsTypeParameterCache.asInstanceOf[js.Any], getWrapsTypeParameter = js.Any.fromFunction1(getWrapsTypeParameter), setWrapsTypeParameter = js.Any.fromFunction2(setWrapsTypeParameter))
    __obj.asInstanceOf[WrapsTypeParameterCache]
  }
  @scala.inline
  implicit class WrapsTypeParameterCacheOps[Self <: WrapsTypeParameterCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_wrapsTypeParameterCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_wrapsTypeParameterCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWrapsTypeParameter(value: TypeArgumentMap => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWrapsTypeParameter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetWrapsTypeParameter(value: (TypeArgumentMap, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWrapsTypeParameter")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

