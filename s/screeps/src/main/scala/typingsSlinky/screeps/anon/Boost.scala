package typingsSlinky.screeps.anon

import typingsSlinky.screeps.BodyPartConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Boost[T /* <: BodyPartConstant */] extends js.Object {
  /**
    * One of the `RESOURCE_*` constants.
    *
    * If the body part is boosted, this property specifies the mineral type which is used for boosting.
    */
  var boost: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
  ] = js.native
  /**
    * The remaining amount of hit points of this body part.
    */
  var hits: Double = js.native
  /**
    * One of the body part types constants.
    */
  var `type`: T = js.native
}

object Boost {
  @scala.inline
  def apply[T](hits: Double, `type`: T): Boost[T] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boost[T]]
  }
  @scala.inline
  implicit class BoostOps[Self[t] <: Boost[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withHits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoost(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof screeps.anon.Dictpart[T] */ js.Any
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoost: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boost")(js.undefined)
        ret
    }
  }
  
}

