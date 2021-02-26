package typingsSlinky.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionUtilsMod {
  
  @JSImport("typeorm/browser/util/VersionUtils", "VersionUtils")
  @js.native
  class VersionUtils () extends StObject
  /* static members */
  object VersionUtils {
    
    @JSImport("typeorm/browser/util/VersionUtils", "VersionUtils.isGreaterOrEqual")
    @js.native
    def isGreaterOrEqual(version: String, targetVersion: String): Boolean = js.native
  }
  
  type Version = js.Tuple3[Double, Double, Double]
}
