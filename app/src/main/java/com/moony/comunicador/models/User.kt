package com.moony.comunicador.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/*Check build.gradle for getting how to make an class parcelable.*/
@Parcelize
class User(val uid: String, val username: String, val profileImageUrl: String) : Parcelable {
    constructor() : this("", "", "")
}