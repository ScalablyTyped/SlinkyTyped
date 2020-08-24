package typingsSlinky.tizenCommonWeb.tizenMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.CONTAINS
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.ENDSWITH
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.EXACTLY
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.EXISTS
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.FULLSTRING
import typingsSlinky.tizenCommonWeb.tizenCommonWebStrings.STARTSWITH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeFilterConstructor
  extends Instantiable1[/* attributeName */ String, AttributeFilter]
     with Instantiable2[
      /* attributeName */ String, 
      CONTAINS | ENDSWITH | EXACTLY | EXISTS | FULLSTRING | STARTSWITH | (/* matchFlag */ FilterMatchFlag), 
      AttributeFilter
    ]
     with Instantiable3[
      /* attributeName */ String, 
      js.UndefOr[
        CONTAINS | ENDSWITH | EXACTLY | EXISTS | FULLSTRING | STARTSWITH | (/* matchFlag */ FilterMatchFlag)
      ], 
      /* matchValue */ js.Any, 
      AttributeFilter
    ]

