FROM amd64/node:14.17.5-alpine3.14 as build-stage
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY ./ .
RUN npm run build

FROM nginx:mainline-alpine as production-stage
COPY --from=build-stage /app/dist /usr/share/nginx/html/calculator/
COPY nginx.conf /etc/nginx/nginx.conf
