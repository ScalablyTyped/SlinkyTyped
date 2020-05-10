package typingsSlinky.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.tensorflowTfjsConverter.compiledApiMod.MetaGraphDef.IMetaInfoDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetaGraphDef extends js.Object {
  /** MetaGraphDef assetFileDef */
  var assetFileDef: js.UndefOr[js.Array[IAssetFileDef] | Null] = js.native
  /** MetaGraphDef collectionDef */
  var collectionDef: js.UndefOr[StringDictionary[ICollectionDef] | Null] = js.native
  /** MetaGraphDef graphDef */
  var graphDef: js.UndefOr[IGraphDef | Null] = js.native
  /** MetaGraphDef metaInfoDef */
  var metaInfoDef: js.UndefOr[IMetaInfoDef | Null] = js.native
  /** MetaGraphDef saverDef */
  var saverDef: js.UndefOr[ISaverDef | Null] = js.native
  /** MetaGraphDef signatureDef */
  var signatureDef: js.UndefOr[StringDictionary[ISignatureDef] | Null] = js.native
}

object IMetaGraphDef {
  @scala.inline
  def apply(): IMetaGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMetaGraphDef]
  }
  @scala.inline
  implicit class IMetaGraphDefOps[Self <: IMetaGraphDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetFileDef(value: js.Array[IAssetFileDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetFileDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileDef")(js.undefined)
        ret
    }
    @scala.inline
    def withAssetFileDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetFileDef")(null)
        ret
    }
    @scala.inline
    def withCollectionDef(value: StringDictionary[ICollectionDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionDef")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionDef")(null)
        ret
    }
    @scala.inline
    def withGraphDef(value: IGraphDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGraphDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphDef")(js.undefined)
        ret
    }
    @scala.inline
    def withGraphDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphDef")(null)
        ret
    }
    @scala.inline
    def withMetaInfoDef(value: IMetaInfoDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaInfoDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaInfoDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaInfoDef")(js.undefined)
        ret
    }
    @scala.inline
    def withMetaInfoDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaInfoDef")(null)
        ret
    }
    @scala.inline
    def withSaverDef(value: ISaverDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saverDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaverDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saverDef")(js.undefined)
        ret
    }
    @scala.inline
    def withSaverDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saverDef")(null)
        ret
    }
    @scala.inline
    def withSignatureDef(value: StringDictionary[ISignatureDef]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureDef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDef")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureDefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureDef")(null)
        ret
    }
  }
  
}

