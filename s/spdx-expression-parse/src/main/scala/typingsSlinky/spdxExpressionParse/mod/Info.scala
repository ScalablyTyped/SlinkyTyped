package typingsSlinky.spdxExpressionParse.mod

import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.and
import typingsSlinky.spdxExpressionParse.spdxExpressionParseStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.spdxExpressionParse.mod.LicenseInfo
  - typingsSlinky.spdxExpressionParse.mod.ConjuctionInfo
*/
trait Info extends js.Object
object Info {
  
  @scala.inline
  def LicenseInfo(license: String): Info = {
    val __obj = js.Dynamic.literal(license = license.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  
  @scala.inline
  def ConjuctionInfo(
    conjunction: and | or,
    left: LicenseInfo | typingsSlinky.spdxExpressionParse.mod.ConjuctionInfo,
    right: LicenseInfo | typingsSlinky.spdxExpressionParse.mod.ConjuctionInfo
  ): Info = {
    val __obj = js.Dynamic.literal(conjunction = conjunction.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}
