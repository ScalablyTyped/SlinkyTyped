package typingsSlinky.winrt.Windows.UI.StartScreen

import typingsSlinky.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecondaryTileFactory extends js.Object {
  def createTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri
  ): SecondaryTile = js.native
  def createWideTile(
    tileId: String,
    shortName: String,
    displayName: String,
    arguments: String,
    tileOptions: TileOptions,
    logoReference: Uri,
    wideLogoReference: Uri
  ): SecondaryTile = js.native
  def createWithId(tileId: String): SecondaryTile = js.native
}

object ISecondaryTileFactory {
  @scala.inline
  def apply(
    createTile: (String, String, String, String, TileOptions, Uri) => SecondaryTile,
    createWideTile: (String, String, String, String, TileOptions, Uri, Uri) => SecondaryTile,
    createWithId: String => SecondaryTile
  ): ISecondaryTileFactory = {
    val __obj = js.Dynamic.literal(createTile = js.Any.fromFunction6(createTile), createWideTile = js.Any.fromFunction7(createWideTile), createWithId = js.Any.fromFunction1(createWithId))
    __obj.asInstanceOf[ISecondaryTileFactory]
  }
  @scala.inline
  implicit class ISecondaryTileFactoryOps[Self <: ISecondaryTileFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTile(value: (String, String, String, String, TileOptions, Uri) => SecondaryTile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTile")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withCreateWideTile(value: (String, String, String, String, TileOptions, Uri, Uri) => SecondaryTile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWideTile")(js.Any.fromFunction7(value))
        ret
    }
    @scala.inline
    def withCreateWithId(value: String => SecondaryTile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWithId")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

