package typingsSlinky.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("GlideSecureRandomUtil")
@js.native
object GlideSecureRandomUtil extends js.Object {
  
  /**
    * Generates a pseudo-random integer.
    *
    * @returns The pseudo-randomly generated integer.
    * @example
    *
    * gs.info(GlideSecureRandomUtil.getSecureRandomInt());
    */
  def getSecureRandomInt(): Double = js.native
  
  /**
    * Generates a pseudo-random integer between 0 (inclusive) and the bound (exclusive) value that
    * you pass into the method.
    *
    * @param bound The bound value.
    * @returns The pseudo-randomly generated integer.
    * @example
    *
    * gs.info(GlideSecureRandomUtil.getSecureRandomIntBound(100));
    */
  def getSecureRandomIntBound(bound: Double): Double = js.native
  
  /**
    * Generates pseudo-random long value.
    *
    * @returns The pseudo-randomly generated 64-bit integer.
    * @example
    *
    * gs.info(GlideSecureRandomUtil.getSecureRandomLong());
    */
  def getSecureRandomLong(): Double = js.native
  
  /**
    * Generates a random alpha-numeric String with the specified length.
    *
    * @param length The length of the string in number of characters.
    * @returns The randomly generated string.
    * @example
    *
    * gs.info(GlideSecureRandomUtil.getSecureRandomString(12));
    */
  def getSecureRandomString(length: Double): String = js.native
}
