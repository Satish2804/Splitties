/*
 * Copyright (c) 2018. Louis Cognault Ayeva Derman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE")

package splitties.viewdsl.core

import android.content.Context
import android.widget.LinearLayout

inline fun verticalLayout(ctx: Context) = LinearLayout(ctx).apply {
    orientation = LinearLayout.VERTICAL
}

inline fun horizontalLayout(ctx: Context) = LinearLayout(ctx)

// LayoutParams below

inline fun LinearLayout.lParams(
        width: Int = wrapContent,
        height: Int = wrapContent,
        initParams: LinearLayout.LayoutParams.() -> Unit
) = LinearLayout.LayoutParams(width, height).apply(initParams)

inline fun LinearLayout.lParams(
        width: Int = wrapContent,
        height: Int = wrapContent
) = LinearLayout.LayoutParams(width, height)

inline fun LinearLayout.lParams(
        width: Int = wrapContent,
        height: Int = wrapContent,
        gravity: Int = -1,
        weight: Float = 0f
) = LinearLayout.LayoutParams(width, height).also {
    it.gravity = gravity
    it.weight = weight
}
