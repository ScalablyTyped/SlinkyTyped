package typingsSlinky.typeFest

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("type-fest/source/merge-exclusive", JSImport.Namespace)
@js.native
object mergeExclusiveMod extends js.Object {
  
  type MergeExclusive[FirstType, SecondType] = FirstType | SecondType | ((Without[FirstType, SecondType]) with SecondType) | ((Without[SecondType, FirstType]) with FirstType)
  
  type Without[FirstType, SecondType] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ KeyType in std.Exclude<keyof FirstType, keyof SecondType> ]:? never}
    */ typingsSlinky.typeFest.typeFestStrings.Without with TopLevel[js.Any]
}
