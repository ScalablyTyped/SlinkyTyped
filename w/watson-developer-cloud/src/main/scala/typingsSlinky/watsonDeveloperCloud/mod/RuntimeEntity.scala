package typingsSlinky.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A term from the request that was identified as an entity. */
@js.native
trait RuntimeEntity
  extends /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  /** A decimal percentage that represents Watson's confidence in the entity. */
  var confidence: js.UndefOr[Double] = js.native
  /** An entity detected in the input. */
  var entity: String = js.native
  /** The recognized capture groups for the entity, as defined by the entity pattern. */
  var groups: js.UndefOr[js.Array[CaptureGroup]] = js.native
  /** An array of zero-based character offsets that indicate where the detected entity values begin and end in the input text. */
  var location: js.Array[Double] = js.native
  /** Any metadata for the entity. */
  var metadata: js.UndefOr[js.Object] = js.native
  /** The term in the input text that was recognized as an entity value. */
  var value: String = js.native
}

object RuntimeEntity {
  @scala.inline
  def apply(entity: String, location: js.Array[Double], value: String): RuntimeEntity = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeEntity]
  }
  @scala.inline
  implicit class RuntimeEntityOps[Self <: RuntimeEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[CaptureGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

