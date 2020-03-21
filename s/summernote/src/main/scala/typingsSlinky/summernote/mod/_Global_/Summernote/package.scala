package typingsSlinky.summernote.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Summernote {
  type EditImageCallback = js.Function1[/* $image */ typingsSlinky.jquery.JQuery_.Node, scala.Unit]
  type colorsDef = js.Array[js.Array[js.Array[java.lang.String]]]
  type htmlElement = java.lang.String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.color, 
      typingsSlinky.summernote.mod._Global_.Summernote.popoverAirOptionsColor
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.font, 
      typingsSlinky.summernote.mod._Global_.Summernote.popoverAirOptionsFont
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.para, 
      typingsSlinky.summernote.mod._Global_.Summernote.popoverAirOptionsPara
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.table, 
      typingsSlinky.summernote.mod._Global_.Summernote.popoverAirOptionsTable
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.insert, 
      typingsSlinky.summernote.mod._Global_.Summernote.popoverAirOptionsInsert
    ]
  ]
  type popoverAirOptionsColor = typingsSlinky.summernote.summernoteStrings.color
  type popoverAirOptionsTable = typingsSlinky.summernote.summernoteStrings.table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.imagesize, 
      js.Array[typingsSlinky.summernote.mod._Global_.Summernote.popoverImageOptionsImagesize]
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.float, 
      js.Array[typingsSlinky.summernote.mod._Global_.Summernote.popoverImageOptionsFloat]
    ], 
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.remove, 
      js.Array[typingsSlinky.summernote.mod._Global_.Summernote.popoverImageOptionsRemove]
    ]
  ]
  type popoverImageOptionsRemove = typingsSlinky.summernote.summernoteStrings.removeMedia
  type popoverLinkDef = js.Array[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.link, 
      js.Array[typingsSlinky.summernote.mod._Global_.Summernote.popoverLinkLinkOptions]
    ]
  ]
  type toolbarColorGroupOptions = typingsSlinky.summernote.summernoteStrings.color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      typingsSlinky.summernote.summernoteStrings.style | typingsSlinky.summernote.summernoteStrings.font | typingsSlinky.summernote.summernoteStrings.fontsize_ | typingsSlinky.summernote.summernoteStrings.color | typingsSlinky.summernote.summernoteStrings.para | typingsSlinky.summernote.summernoteStrings.height | typingsSlinky.summernote.summernoteStrings.table | typingsSlinky.summernote.summernoteStrings.insert | typingsSlinky.summernote.summernoteStrings.view | typingsSlinky.summernote.summernoteStrings.help | typingsSlinky.summernote.summernoteStrings.misc, 
      js.Array[
        typingsSlinky.summernote.mod._Global_.Summernote.miscGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarColorGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarFontGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarFontsizeGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarHeightGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarHelpGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarInsertGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarParaGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarStyleGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarTableGroupOptions | typingsSlinky.summernote.mod._Global_.Summernote.toolbarViewGroupOptions
      ]
    ]
  ]
  type toolbarHeightGroupOptions = typingsSlinky.summernote.summernoteStrings.height
  type toolbarHelpGroupOptions = typingsSlinky.summernote.summernoteStrings.help
  type toolbarTableGroupOptions = typingsSlinky.summernote.summernoteStrings.table
}
