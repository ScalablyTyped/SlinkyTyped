package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerModuleNameCache extends js.Object {
  def get(directory: java.lang.String): js.UndefOr[ResolvedModuleWithFailedLookupLocations] = js.native
  def set(directory: java.lang.String, result: ResolvedModuleWithFailedLookupLocations): Unit = js.native
}

object PerModuleNameCache {
  @scala.inline
  def apply(
    get: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations],
    set: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit
  ): PerModuleNameCache = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[PerModuleNameCache]
  }
  @scala.inline
  implicit class PerModuleNameCacheOps[Self <: PerModuleNameCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: java.lang.String => js.UndefOr[ResolvedModuleWithFailedLookupLocations]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (java.lang.String, ResolvedModuleWithFailedLookupLocations) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

