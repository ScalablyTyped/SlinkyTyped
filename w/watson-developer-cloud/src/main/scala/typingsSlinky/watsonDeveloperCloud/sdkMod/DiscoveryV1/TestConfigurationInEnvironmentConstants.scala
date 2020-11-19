package typingsSlinky.watsonDeveloperCloud.sdkMod.DiscoveryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `testConfigurationInEnvironment` operation. */
@JSImport("watson-developer-cloud/sdk", "DiscoveryV1.TestConfigurationInEnvironmentConstants")
@js.native
object TestConfigurationInEnvironmentConstants extends js.Object {
  
  /** The content type of file. */
  @js.native
  object FileContentType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType with String
      ] = js.native
    
    /* "application/json" */ val APPLICATION_JSON: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_JSON with String = js.native
    
    /* "application/msword" */ val APPLICATION_MSWORD: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_MSWORD with String = js.native
    
    /* "application/pdf" */ val APPLICATION_PDF: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_PDF with String = js.native
    
    /* "application/vnd.openxmlformats-officedocument.wordprocessingml.document" */ val APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT with String = js.native
    
    /* "application/xhtml+xml" */ val APPLICATION_XHTML_XML: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.APPLICATION_XHTML_XML with String = js.native
    
    /* "text/html" */ val TEXT_HTML: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.FileContentType.TEXT_HTML with String = js.native
  }
  
  /** Specify to only run the input document through the given step instead of running the input document through the entire ingestion workflow. Valid values are `convert`, `enrich`, and `normalize`. */
  @js.native
  object Step extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step with String
      ] = js.native
    
    /* "enrichments_output" */ val ENRICHMENTS_OUTPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.ENRICHMENTS_OUTPUT with String = js.native
    
    /* "html_input" */ val HTML_INPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_INPUT with String = js.native
    
    /* "html_output" */ val HTML_OUTPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.HTML_OUTPUT with String = js.native
    
    /* "json_normalizations_output" */ val JSON_NORMALIZATIONS_OUTPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_NORMALIZATIONS_OUTPUT with String = js.native
    
    /* "json_output" */ val JSON_OUTPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.JSON_OUTPUT with String = js.native
    
    /* "normalizations_output" */ val NORMALIZATIONS_OUTPUT: typingsSlinky.watsonDeveloperCloud.v1GeneratedMod.TestConfigurationInEnvironmentConstants.Step.NORMALIZATIONS_OUTPUT with String = js.native
  }
}
