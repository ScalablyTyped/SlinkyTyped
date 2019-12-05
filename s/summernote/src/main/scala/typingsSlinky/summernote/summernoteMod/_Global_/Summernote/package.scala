package typingsSlinky.summernote.summernoteMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Summernote {
  import typingsSlinky.jquery.JQuery.Node
  import typingsSlinky.summernote.summernoteStrings.color
  import typingsSlinky.summernote.summernoteStrings.float
  import typingsSlinky.summernote.summernoteStrings.font
  import typingsSlinky.summernote.summernoteStrings.fontsize_
  import typingsSlinky.summernote.summernoteStrings.height
  import typingsSlinky.summernote.summernoteStrings.help
  import typingsSlinky.summernote.summernoteStrings.imagesize
  import typingsSlinky.summernote.summernoteStrings.insert
  import typingsSlinky.summernote.summernoteStrings.link
  import typingsSlinky.summernote.summernoteStrings.misc
  import typingsSlinky.summernote.summernoteStrings.para
  import typingsSlinky.summernote.summernoteStrings.remove
  import typingsSlinky.summernote.summernoteStrings.removeMedia
  import typingsSlinky.summernote.summernoteStrings.style
  import typingsSlinky.summernote.summernoteStrings.table
  import typingsSlinky.summernote.summernoteStrings.view

  type EditImageCallback = js.Function1[/* $image */ Node, Unit]
  type colorsDef = js.Array[js.Array[js.Array[String]]]
  type htmlElement = String
  type popoverAirDef = js.Tuple5[
    js.Tuple2[color, popoverAirOptionsColor], 
    js.Tuple2[font, popoverAirOptionsFont], 
    js.Tuple2[para, popoverAirOptionsPara], 
    js.Tuple2[table, popoverAirOptionsTable], 
    js.Tuple2[insert, popoverAirOptionsInsert]
  ]
  type popoverAirOptionsColor = color
  type popoverAirOptionsTable = table
  type popoverImageDef = js.Tuple3[
    js.Tuple2[imagesize, js.Array[popoverImageOptionsImagesize]], 
    js.Tuple2[float, js.Array[popoverImageOptionsFloat]], 
    js.Tuple2[remove, js.Array[popoverImageOptionsRemove]]
  ]
  type popoverImageOptionsRemove = removeMedia
  type popoverLinkDef = js.Array[js.Tuple2[link, js.Array[popoverLinkLinkOptions]]]
  type toolbarColorGroupOptions = color
  // type toolbarDef = [string, string[]][]
  type toolbarDef = js.Array[
    js.Tuple2[
      style | font | fontsize_ | color | para | height | table | insert | view | help | misc, 
      js.Array[
        miscGroupOptions | toolbarColorGroupOptions | toolbarFontGroupOptions | toolbarFontsizeGroupOptions | toolbarHeightGroupOptions | toolbarHelpGroupOptions | toolbarInsertGroupOptions | toolbarParaGroupOptions | toolbarStyleGroupOptions | toolbarTableGroupOptions | toolbarViewGroupOptions
      ]
    ]
  ]
  type toolbarHeightGroupOptions = height
  type toolbarHelpGroupOptions = help
  type toolbarTableGroupOptions = table
}
