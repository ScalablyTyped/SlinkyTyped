package typingsSlinky.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobEnvironment extends js.Object {
  var endpoints: js.Array[ServiceEndpoint] = js.native
  var mask: js.Array[MaskHint] = js.native
  var options: StringDictionary[JobOption] = js.native
  var secureFiles: js.Array[SecureFile] = js.native
  /**
    * Gets or sets the endpoint used for communicating back to the calling service.
    */
  var systemConnection: ServiceEndpoint = js.native
  var variables: StringDictionary[String] = js.native
}

object JobEnvironment {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint],
    mask: js.Array[MaskHint],
    options: StringDictionary[JobOption],
    secureFiles: js.Array[SecureFile],
    systemConnection: ServiceEndpoint,
    variables: StringDictionary[String]
  ): JobEnvironment = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], secureFiles = secureFiles.asInstanceOf[js.Any], systemConnection = systemConnection.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEnvironment]
  }
  @scala.inline
  implicit class JobEnvironmentOps[Self <: JobEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Array[ServiceEndpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMask(value: js.Array[MaskHint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[JobOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureFiles(value: js.Array[SecureFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemConnection(value: ServiceEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemConnection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

