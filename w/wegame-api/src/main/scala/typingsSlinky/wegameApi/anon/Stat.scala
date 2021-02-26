package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stat extends StObject {
  
  var stat: Stats = js.native
}
object Stat {
  
  @scala.inline
  def apply(stat: Stats): Stat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  
  @scala.inline
  implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
