package typingsSlinky.storybookApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: typingsSlinky.storybookApi.versionsMod.Version | Version
  var latest: js.UndefOr[typingsSlinky.storybookApi.versionsMod.Version] = js.undefined
  var next: js.UndefOr[typingsSlinky.storybookApi.versionsMod.Version] = js.undefined
}

object Current {
  @scala.inline
  def apply(
    current: typingsSlinky.storybookApi.versionsMod.Version | Version,
    latest: typingsSlinky.storybookApi.versionsMod.Version = null,
    next: typingsSlinky.storybookApi.versionsMod.Version = null
  ): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    if (latest != null) __obj.updateDynamic("latest")(latest.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

