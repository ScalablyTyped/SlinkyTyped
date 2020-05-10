package typingsSlinky.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetentionSettings extends js.Object {
  var daysToKeepDeletedReleases: Double = js.native
  var defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy = js.native
  var maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy = js.native
}

object RetentionSettings {
  @scala.inline
  def apply(
    daysToKeepDeletedReleases: Double,
    defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy,
    maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  ): RetentionSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedReleases = daysToKeepDeletedReleases.asInstanceOf[js.Any], defaultEnvironmentRetentionPolicy = defaultEnvironmentRetentionPolicy.asInstanceOf[js.Any], maximumEnvironmentRetentionPolicy = maximumEnvironmentRetentionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetentionSettings]
  }
  @scala.inline
  implicit class RetentionSettingsOps[Self <: RetentionSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaysToKeepDeletedReleases(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysToKeepDeletedReleases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEnvironmentRetentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaximumEnvironmentRetentionPolicy(value: EnvironmentRetentionPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumEnvironmentRetentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

