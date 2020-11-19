package typingsSlinky.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tsconfigPaths.tsconfigPathsStrings.failed
import typingsSlinky.tsconfigPaths.tsconfigPathsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderSuccessResult
  - typingsSlinky.tsconfigPaths.configLoaderMod.ConfigLoaderFailResult
*/
trait ConfigLoaderResult extends js.Object
object ConfigLoaderResult {
  
  @scala.inline
  def ConfigLoaderSuccessResult(
    absoluteBaseUrl: String,
    baseUrl: String,
    configFileAbsolutePath: String,
    paths: StringDictionary[js.Array[String]],
    resultType: success
  ): ConfigLoaderResult = {
    val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderResult]
  }
  
  @scala.inline
  def ConfigLoaderFailResult(message: String, resultType: failed): ConfigLoaderResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderResult]
  }
}
